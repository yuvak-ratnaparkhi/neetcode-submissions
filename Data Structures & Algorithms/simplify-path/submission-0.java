class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            // Ignore empty parts and "."
            if (part.equals("") || part.equals(".")) {
                continue;
            }

            // Go to parent directory
            else if (part.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            }

            // Normal directory name
            else {
                stack.push(part);
            }
        }

        // Build the final path
        StringBuilder result = new StringBuilder();

        for (String folder : stack) {
            result.append("/").append(folder);
        }

        // If stack is empty, we are at root
        if (result.length() == 0) {
            return "/";
        }

        return result.toString();
    }
}