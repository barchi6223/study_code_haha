#include "HX711.h"
#include  <SoftwareSerial.h>
// HX711.DOUT  - pin #A1
// HX711.PD_SCK - pin #A0
SoftwareSerial BTSerial(10, 11); // RX | TX
HX711 scale(A0, A1);    // parameter "gain" is ommited; the default value 128 is used by the library
#define NUMBER 6
//float ForceArray [NUMBER];
//Timer t;
void setup()
{
//  for (int i = 0; i < NUMBER; i++) {        ////在程式初始時先放元素進陣列
//    scale.set_scale(2280.f);
//    ForceArray[i] = (scale.get_units());
//  }
 // pinMode(5, OUTPUT);  // this pin will pull the HC-05 pin 34 (key pin) HIGH to switch module to AT mode
  //digitalWrite(5, HIGH);
  Serial.begin(38400);
  Serial.println("Enter AT commands:");
  BTSerial.begin(38400);  // HC-05 default speed in AT command more
  
  //scale.set_scale(2280.f);                      // this value is obtained by calibrating the scale with known weights; see the README for details
  //scale.tare();               // reset the scale to 0
  
  //t.every(1000,take);
}

/*void PutArray () {                        ////右移陣列放值進第一元素
  for (int i = NUMBER - 1; i > 0; i--) {
    ForceArray[i] = ForceArray[i - 1];
  }
  ForceArray[0] = (scale.get_units());
}


void List() {                             ////陣列查看
  for (int i = 0; i < NUMBER; i++) {
    Serial.print(ForceArray[i], 1);
    Serial.print("\t");
  }
  Serial.print("Average:");
  Serial.println(Average());
}
void take(){
    Serial.println("1000000");
    //delay(1);
  }
  
float Average() {                         ////平均數
  float sum = 0;
  for (int i = 0; i < NUMBER; i++) {
    sum += ForceArray[i];
  }
  return (sum / NUMBER);
} */                          
void loop()
{ 
  //t.update();
  
  //PutArray ();
   
  //BTSerial.println(Average(),0);
  if (BTSerial.available())    // Keep reading from HC-05 and send to Arduino Serial Monitor 
  Serial.println(BTSerial.read());
   //Serial.println(Average(),0);
   //.println("one reading:\t");
   //Serial.println(scale.get_units(),0);//應變規
  
  //Serial.println("one reading:\t");
  if (Serial.available())           // Keep reading from Arduino Serial Monitor and send to HC-05
  BTSerial.println(Serial.read());
}

