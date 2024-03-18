package sequence;


class Material {
    private String name;
    private String properties;

    public Material(String name, String properties) {
        this.name = name;
        this.properties = properties;
    }

    // Getters and setters (if needed)
}

// Garment interface
interface Garment {
    void create();
}

// Shirt class
class Shirt implements Garment {
    private Material material;
    private String design;

    public Shirt(Material material, String design) {
        this.material = material;
        this.design = design;
    }

    @Override
    public void create() {
        // Implement shirt creation logic
        System.out.println("Creating a shirt with material: " + material.getName() +
                           ", design: " + design);
    }
}

// Hat class
class Hat implements Garment {
    private Material material;
    private String design;

    public Hat(Material material, String design) {
        this.material = material;
        this.design = design;
    }

    @Override
    public void create() {
        // Implement hat creation logic
        System.out.println("Creating a hat with material: " + material.getName() +
                           ", design: " + design);
    }
}

// Jacket class
class Jacket implements Garment {
    private Material material;
    // Additional properties specific to jackets

    public Jacket(Material material) {
        this.material = material;
    }

    @Override
    public void create() {
        // Implement jacket creation logic
        System.out.println("Creating a jacket with material: " + material.getName());
    }
}

// GarmentFactory class
class GarmentFactory {
    public Garment createShirt(Material material, String design) {
        return new Shirt(material, design);
    }

    public Garment createHat(Material material, String design) {
        return new Hat(material, design);
    }

    public Garment createJacket(Material material) {
        return new Jacket(material);
    }
}

// Injector class (basic example)
class Injector {
    public static void main(String[] args) {
        // Create a material
        Material fabricMaterial = new Material("Cotton", "Soft and breathable");

        // Create a garment factory
        GarmentFactory factory = new GarmentFactory();

        // Create a shirt using the factory and material
        Garment shirt = factory.createShirt(fabricMaterial, "Striped");
        shirt.create();

        // Create a hat using the factory and material
        Garment hat = factory.createHat(fabricMaterial, "Fedora");
        hat.create();

        // Create a jacket using the factory and material
        Garment jacket = factory.createJacket(fabricMaterial);
        jacket.create();
    }
}
