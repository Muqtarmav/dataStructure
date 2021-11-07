package neewPackage;

public class Circle {
        private int radius;


        public Circle(){
        }


        public void setArea(int radius) {
            if (radius > 2) {
                this.radius = radius;
            }
        }
        public double getPerimeter(){
            return 2 * radius  * Math.PI;
        }

        public int getArea(){
            return radius * radius;


        }






}

