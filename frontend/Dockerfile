# Step 1: Build the React application
FROM node:20-alpine as build

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json (if available) to leverage Docker cache
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application files
COPY . .

# Build the application for production
RUN npm run build

# Step 2: Use Nginx to serve the React app
FROM nginx:stable-alpine

# Copy the build output to Nginx's default HTML location
COPY --from=build /app/build /usr/share/nginx/html

# Expose the port that Nginx serves on
EXPOSE 80

# Start Nginx server
CMD ["nginx", "-g", "daemon off;"]
