public class CompositePattern {
    public static void main(String[] args) {

        System.out.println("===== FILE SYSTEM CREATION STARTED =====\n");


        // Creating the root folder
        System.out.println("Creating root folder...");
        Folder root = new Folder("root");


        // Adding files into root folder
        System.out.println("Adding file1.txt into root");
        root.add(new File("file1.txt", 100));

        System.out.println("Adding file2.txt into root");
        root.add(new File("file2.txt", 200));


        // Creating docs folder
        System.out.println("\nCreating docs folder...");
        Folder docs = new Folder("docs");


        // Adding files into docs folder
        System.out.println("Adding doc1.pdf into docs");
        docs.add(new File("doc1.pdf", 300));

        System.out.println("Adding doc2.pdf into docs");
        docs.add(new File("doc2.pdf", 400));


        // Creating nested folder
        System.out.println("\nCreating docsdocs folder...");
        Folder docsdocs = new Folder("docsdocs");


        // Adding nested folder into docs
        System.out.println("Adding docsdocs inside docs");
        docs.add(docsdocs);


        // Adding docs folder into root
        System.out.println("Adding docs folder into root");
        root.add(docs);


        // Creating images folder
        System.out.println("\nCreating images folder...");
        Folder images = new Folder("images");


        // Adding image files
        System.out.println("Adding Photo1.jpg into images");
        images.add(new File("Photo1.jpg", 500));

        System.out.println("Adding Photo2.jpg into images");
        images.add(new File("Photo2.jpg", 600));


        // Adding images folder into root
        System.out.println("Adding images folder into root");
        root.add(images);


        // Listing all contents in root
        System.out.println("\n===== LS ROOT =====");
        root.ls(0);


        // Listing all contents in docs
        System.out.println("\n===== LS DOCS =====");
        docs.ls(0);


        // Opening everything recursively
        System.out.println("\n===== OPEN ALL FROM ROOT =====");
        root.openAll(0);


        // Changing directory to docs
        System.out.println("\n===== CD INTO DOCS =====");
        FileSystemItem cwd = root.cd("docs");


        // Checking if folder exists
        if (cwd != null) {

            System.out.println("Successfully moved into docs folder");

            // Listing contents inside docs
            System.out.println("\n===== LS CURRENT DIRECTORY =====");
            cwd.ls(0);
        } else {

            System.out.println("Could not cd into docs");
        }


        // Calculating total size
        System.out.println("\n===== CALCULATING TOTAL SIZE =====");
        System.out.println("Total Size of root folder: " + root.getSize());


        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}