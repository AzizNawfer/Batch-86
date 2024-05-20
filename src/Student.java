 class Student{


        //Attributes syntax = type + name + value


        int id;
        String name;
        String email;
        int PhoneNum;

        //Syntax of Constructor = classname + (Pass attribute) + {this.attributeName = attributeName;}

        Student(int id,String name,String email,int PhoneNum ) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.PhoneNum = PhoneNum;
        }
            //syntax of method = return type + method name +() + {}

              //Study
            //Read
            //Write

            void Study() {
                System.out.println(id );
                System.out.println( email );
                System.out.println( PhoneNum );
            }

            void Read(){
                System.out.println("Student can Read");
                }

            void Write(){
                System.out.println("Student can Write");
            }



        }








