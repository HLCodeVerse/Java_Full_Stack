package Assignment_4.HotelReservationSystem;

 public class Hotel {
     Room room1=new Room(101,true,500);
     Room room2=new Room(103,false,550);

     public void checkAvailability(int roomNumber){
         if( room1.getRoomNumber ()== roomNumber ){
            if ( room1.isAvailable ( ) ){
                System.out.println (room1.getRoomNumber ()+" is Avialable" );
            }else {
                System.out.println ("Room not avialable" );
            }
         } else if ( room2.getRoomNumber() ==  roomNumber ) {
             if ( room2.isAvailable ( ) ) {
                 System.out.println (room2.getRoomNumber ()+" is Avialable" );
             }else{
                 System.out.println ("Room not avialable" );
             }

         } else {
             System.out.println ("All rooms are reserved" );
         }
     }

     public void reserve(int roomNumber) {
         if ( room1.getRoomNumber ( ) == roomNumber ) {
             System.out.println ( room1.getRoomNumber ( ) + " Room Reserved Sucessfully" );
         } else if ( room2.getRoomNumber ( ) == roomNumber ) {
             System.out.println ( room2.getRoomNumber ( ) + " Room Reserved Sucessfully" );
         }
     }
        public  double totalPrice(){
         double totalPrice = room1.getPricePerNight () + Guest.getTotalNights ();
         return totalPrice;
        }

 }
