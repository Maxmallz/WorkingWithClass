package com.maxmallz;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        try{
            flight1.SetMaximumCapacity(100);
            flight1.SetTotalPassengers(80);

            flight2.SetMaximumCapacity(400);
            flight2.SetTotalPassengers(350);

            System.out.println(flight1.MaximumCapacity());
            System.out.println(flight1.TotalPassengers());

            System.out.println();
            System.out.println(flight2.MaximumCapacity());
            System.out.println(flight2.TotalPassengers());
        }
        catch (Exception ex){

        }
    }
}
class Flight{

    int _totalPassengers;
    int _maximumCapacity;

    Flight(){
    }

    Flight(int totalPassengers, int maximumCapacity){
        this._maximumCapacity = maximumCapacity;
        this._totalPassengers = totalPassengers;
    }

    public  int TotalPassengers(){
        return  _totalPassengers;
    }

    public void SetTotalPassengers(int value) throws Exception {
        //total passengers cannot be negative or more than maximum capacity

        if(value > 0 && _maximumCapacity > value){ _totalPassengers = value; }
        else {throw new Exception();}
    }

    public  int MaximumCapacity(){
        return  this._maximumCapacity;
    }

    public  void SetMaximumCapacity(int value)throws  Exception{
        if(value > 0){this._maximumCapacity = value;}
        else{throw new Exception();}
    }
}
