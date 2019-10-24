// Super class Shape3D: for three-dimensional shapes.
package M7.Shapes; 
 class Shape3D { 
    public double getArea(){  return 0.0;}; 
    public double getVolume(){  return 0.0;}; 
    public String toString(){ return " ";}; 
    public boolean equals(Object obj){ return false;}; 
}

// Class SquarePyramid. extends Shape3D 
// Represents a pyramid with a square as its base. 
 class SquarePyramid extends Shape3D { 
    private double length; 
    private double height;

    public SquarePyramid() { 
        length = 0; 
        height = 0; 
    } 
    public SquarePyramid(double l, double h) { 
        length = l; 
        height = h; 
    }

    public double getLength() { 
        return length; 
    }

    public double getHeight() { 
        return height; 
    }

    public double getArea() { 
           // write code here   length * (length + Math.sqrt(length * length + 4 * height * height)); 
           return length * (length + Math.sqrt(length * length + 4 * height * height)); 
    }

    public double getVolume() { 
          return length * length * height / 3.0; 
    }

    public String toString() { 
        return "For this square pyramid the base has the length = " + length + " and the height = " + height+"area = "+getArea()+"volume = "+getVolume(); 
    }

    public boolean equals(Object obj) { 
        if (obj instanceof SquarePyramid) { 
            SquarePyramid other = (SquarePyramid) obj; 
            return length == other.length && height == other.height; 
        } 
        else 
            return false; 
    } 
}

// Class Sphere. extends Shape3D 
// Represents a perfect sphere.

 class Sphere extends Shape3D { 
    private double radius;

    public Sphere() { 
        radius = 0; 
    }

    public Sphere(double r) { 
        radius = r; 
    }

    public double getRadius() { 
        return radius; 
    }

    public double getArea() { 
        return  4 * Math.PI * Math.pow(radius, 2); 
    }

    public double getVolume() { 
        return  4.0 * Math.PI * Math.pow(radius, 3) / 3.0; 
    }

    public String toString() { 
        return "The radius of this sphere = " + radius; 
    }

    public boolean equals(Object obj) { 
       // write code here use instance of operator
       if (obj instanceof Sphere) { 
            Sphere other = (Sphere) obj; 
            return radius == other.radius; 
        } 
        else 
            return false; 
    } 
} 

// Class RectangularPrism. extends Shape3D 
// Represents a three-dimensional rectangular shape.

 class RectangularPrism extends Shape3D { 
    private double length; 
    private double width; 
    private double height;
    

    public RectangularPrism() { 
      // write code here 
    }

    public RectangularPrism(double l, double w, double h) { 
      // write code here 2 * (length * width + width * height + length * height);
      length=l;
      width=w;
      height=h;
    }

    public double getLength() { 
      // write code here  length * width * height; 
      return length;
    }

    public double getWidth() { 
       // write code here 
       return width;
    }

     public double getHeight() { 
        return height; 
    }

    public double getArea() { 
        // write code here 
        return 2 * (length * width + width * height + length * height);

    }

    public double getVolume() { 
       // write code here 
       return length * width * height; 
    }

    public String toString() { 
        return "For this rectangular prism the base has the length = " + length + " and the width = " + width + "\nThe height of the prism = " + height; 
    }

    public boolean equals(Object obj) { 
       //write code here use instance of operator
       if (obj instanceof RectangularPrism) { 
            RectangularPrism other = (RectangularPrism) obj; 
            return length == other.length && height == other.height && width==other.width; 
        } 
        else 
            return false; 
    } 
}

// Class Cube, subclass of RectangularPrism 
// Represents a perfect cube.

 class Cube extends RectangularPrism { 
    public Cube() { 
    // write code here 
    }

    public Cube(double size) { 
    // write code here 
        super(size,size,size);
    }


    public String toString() { 
        return "For this cube all sides = " + super.getLength(); 
    } 
}



//Client to test them all! 
public class ShapeMain{ 
    public static final int MAX = 6; 
    public static void main(String[] args) { 
        Shape3D[] shapes = new Shape3D[MAX];
        //SquarePyramid sq=new SquarePyramid(20,10);
        //Sphere sp=new Sphere(10);
        //RectangularPrism rp= new RectangularPrism(20,10,5);
        //Cube cu=new Cube(7);
        //double s1=sq.getArea();
        //double s2=sq.getVolume();
        shapes[0]=new SquarePyramid(20,10);
        System.out.println(shapes[0]);
        shapes[1]=new Sphere(10);
        System.out.println(shapes[1]);
        shapes[2]=new RectangularPrism(20,10,5);
        System.out.println(shapes[2]);
        shapes[3]=new Cube(7);
        System.out.println(shapes[3]);

// create all objects withe respective consturctors
// display 


       
    } 
}