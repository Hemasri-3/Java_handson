package package2;

import java.util.Scanner;

public class Groceries
{
Scanner sc =new Scanner(System.in);
static double mango_bill=0;
static double apple_bill=0;
static double banana_bill=0;
static double papaya_bill=0;
static double grapes_bill=0;
static double orange_bill=0;
static double onion_bill=0;
static double mirchi_bill=0;
static double brinjal_bill=0;
static double carrot_bill=0;
static double shampoo_bill=0;
static double moisturizer_bill=0;
static double facewash_bill=0;
static double facecream_bill=0;
static double chicken_masala_bill=0;
static double curry_masala_bill=0;
static double garam_masala_bill=0;
static double fish_masala_bill=0;
void menu()
{
System.out.println("Welcome to Rainbow store!!");
System.out.println("We are happy to have you here");
System.out.println("======================");
System.out.println("!! 1) Fruits        !!");
System.out.println("!! 2) Vegetables    !!");
System.out.println("!! 3) Cosmetics     !!");
System.out.println("!! 4) Masala Powders !!");
System.out.println("======================");
System.out.print("Please choose your category of shopping from above options: ");
int fav_catg1=sc.nextInt();
Groceries gobj_menu = new Groceries();
switch(fav_catg1)
{
case 1:
gobj_menu.fruits();
break;
case 2:
gobj_menu.vegetables();
break;
case 3:
gobj_menu.cosmetics();
break;
case 4:
gobj_menu.masalapowders();
break;
default:
System.out.println("You have entered an invalid option");
System.out.println("Please choose your category of shopping from below options:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
int fav_catg2=sc.nextInt();
switch(fav_catg2)
{
case 1:
gobj_menu.fruits();
break;
case 2:
gobj_menu.vegetables();
break;
case 3:
gobj_menu.cosmetics();
break;
case 4:
gobj_menu.masalapowders();
break;
}

}
}

void fruits()
{
Groceries gobj_fruits = new Groceries();
System.out.println("Welcome to Fruits section");
System.out.println("Please choose your favourite fruit items from below list:");
System.out.println("Product_Code, Fruit_Name, Price(for kg)");
System.out.println("125,          Mangoes,    50");
System.out.println("126,          Apples,    100");
System.out.println("127,          Bananans,   25");
System.out.println("128,          Papaya,     44");
System.out.println("129,          Grapes,     60");
System.out.println("130,          Oranges ,   60");
System.out.println("Please enter the Product_Code of the fruit you wish to buy");
int prdt_code=sc.nextInt();
switch(prdt_code)
{
case 125:
System.out.println("That's a great choise!!, as Mangoes are rich in vitamin A, C & K");
System.out.println("Please enter how many kg's of mangoes you wish to buy");
int mango_kg=sc.nextInt();
mango_bill+=mango_kg*50;
System.out.println("Your bill for "+mango_kg+" kg's of Mangoes is: "+mango_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg3=sc.nextInt();
switch(fav_catg3)
{
case 1:
gobj_fruits.fruits();
break;
case 2:
gobj_fruits.vegetables();
break;
case 3:
gobj_fruits.cosmetics();
break;
case 4:
gobj_fruits.masalapowders();
break;
case 5:
gobj_fruits.checkout();
break;

}
break;

case 126:
System.out.println("That's a great choise!!, as we all know an Apple a day keeps Doctor away...");
System.out.println("Please enter how many kg's of apples you wish to buy");
int apple_kg=sc.nextInt();
apple_bill+=apple_kg*100;
System.out.println("Your bill for "+apple_kg+" kg's of Apples is: "+apple_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg4=sc.nextInt();
switch(fav_catg4)
{
case 1:
gobj_fruits.fruits();
break;
case 2:
gobj_fruits.vegetables();
break;
case 3:
gobj_fruits.cosmetics();
break;
case 4:
gobj_fruits.masalapowders();
break;
case 5:
gobj_fruits.checkout();
break;

}
break;
case 127:
System.out.println("That's a great choise!!, Bananas improve your Immune system...");
System.out.println("Please enter how many kg's of bananas you wish to buy");
int banana_kg=sc.nextInt();
banana_bill+=banana_kg*100;
System.out.println("Your bill for "+banana_kg+" kg's of Bananas is: "+banana_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg5=sc.nextInt();
switch(fav_catg5)
{
case 1:
gobj_fruits.fruits();
break;
case 2:
gobj_fruits.vegetables();
break;
case 3:
gobj_fruits.cosmetics();
break;
case 4:
gobj_fruits.masalapowders();
break;
case 5:
gobj_fruits.checkout();
break;

}
break;
case 128:
System.out.println("That's a great choise!!, Papayas are good for heart...");
System.out.println("Please enter how many kg's of papayas you wish to buy");
int papaya_kg=sc.nextInt();
papaya_bill+=papaya_kg*100;
System.out.println("Your bill for "+papaya_kg+" kg's of Papayas is: "+papaya_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg6=sc.nextInt();
switch(fav_catg6)
{
case 1:
gobj_fruits.fruits();
break;
case 2:
gobj_fruits.vegetables();
break;
case 3:
gobj_fruits.cosmetics();
break;
case 4:
gobj_fruits.masalapowders();
break;
case 5:
gobj_fruits.checkout();
break;

}
break;
case 129:
System.out.println("That's a great choise!!, Grapes help for proper funtioning of Blood Pressure...");
System.out.println("Please enter how many kg's of grapes you wish to buy");
int grapes_kg=sc.nextInt();
grapes_bill+=grapes_kg*100;
System.out.println("Your bill for "+grapes_kg+" kg's of Grapes is: "+grapes_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg7=sc.nextInt();
switch(fav_catg7)
{
case 1:
gobj_fruits.fruits();
break;
case 2:
gobj_fruits.vegetables();
break;
case 3:
gobj_fruits.cosmetics();
break;
case 4:
gobj_fruits.masalapowders();
break;
case 5:
gobj_fruits.checkout();
break;

}
break;
case 130:
System.out.println("That's a great choise!!, Oranges help for proper funtioning of Blood Pressure...");
System.out.println("Please enter how many kg's of oranges you wish to buy");
int orange_kg=sc.nextInt();
orange_bill+=orange_kg*100;
System.out.println("Your bill for "+orange_kg+" kg's of Orangs is: "+orange_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg8=sc.nextInt();
switch(fav_catg8)
{
case 1:
gobj_fruits.fruits();
break;
case 2:
gobj_fruits.vegetables();
break;
case 3:
gobj_fruits.cosmetics();
break;
case 4:
gobj_fruits.masalapowders();
break;
case 5:
gobj_fruits.checkout();
break;
}
break;
default:
System.out.println("You have entered an invalid option");
gobj_fruits.fruits();
break;
}
}
void vegetables()
{
Groceries gobj_vegetables = new Groceries();
System.out.println("Welcome to Vegetables section");
System.out.println("Please choose your favourite Vegetabls from below list:");
System.out.println("Product_Code, Vegetable_Name, Price(for kg)");
System.out.println("135,          Onions,    40");
System.out.println("136,          Mirchi,    30");
System.out.println("137,          Brinjal,   40");
System.out.println("138,          Carrot,    50");
System.out.println("Please enter the Product_Code of the fruit you wish to buy");
int prdt_code=sc.nextInt();
switch(prdt_code)
{
case 135:
System.out.println("Hurry Up!! grab the best quality Onions ate the earliest");
System.out.println("Please enter how many kg's of onions you wish to buy");
int onion_kg=sc.nextInt();
onion_bill+= (onion_kg*40);
System.out.println("Your bill for "+onion_kg+" kg's of Onions is: "+onion_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg3=sc.nextInt();
switch(fav_catg3)
{
case 1:
gobj_vegetables.fruits();
break;
case 2:
gobj_vegetables.vegetables();
break;
case 3:
gobj_vegetables.cosmetics();
break;
case 4:
gobj_vegetables.masalapowders();
break;
case 5:
gobj_vegetables.checkout();
break;

}
break;

case 136:
System.out.println("Hurry Up!! grab the best quality Mirchi ate the earliest\"");
System.out.println("Please enter how many kg's of mirchi you wish to buy");
int mirchi_kg=sc.nextInt();
mirchi_bill+=mirchi_kg*30;
System.out.println("Your bill for "+mirchi_kg+" kg's of Mirchi is: "+mirchi_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg4=sc.nextInt();
switch(fav_catg4)
{
case 1:
gobj_vegetables.fruits();
break;
case 2:
gobj_vegetables.vegetables();
break;
case 3:
gobj_vegetables.cosmetics();
break;
case 4:
gobj_vegetables.masalapowders();
break;
case 5:
gobj_vegetables.checkout();
break;

}
break;
case 137:
System.out.println("Hurry Up!! grab the best quality Brinjal ate the earliest\"");
System.out.println("Please enter how many kg's of brinjal you wish to buy");
int brinjal_kg=sc.nextInt();
brinjal_bill+=brinjal_kg*40;
System.out.println("Your bill for "+brinjal_kg+" kg's of Bananas is: "+brinjal_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg5=sc.nextInt();
switch(fav_catg5)
{
case 1:
gobj_vegetables.fruits();
break;
case 2:
gobj_vegetables.vegetables();
break;
case 3:
gobj_vegetables.cosmetics();
break;
case 4:
gobj_vegetables.masalapowders();
break;
case 5:
gobj_vegetables.checkout();
break;

}
break;
case 138:
System.out.println("Hurry Up!! grab the best quality Carrots ate the earliest");
System.out.println("Please enter how many kg's of carrots you wish to buy");
int carrot_kg=sc.nextInt();
carrot_bill+=carrot_kg*50;
System.out.println("Your bill for "+carrot_kg+" kg's of Papayas is: "+carrot_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg6=sc.nextInt();
switch(fav_catg6)
{
case 1:
gobj_vegetables.fruits();
break;
case 2:
gobj_vegetables.vegetables();
break;
case 3:
gobj_vegetables.cosmetics();
break;
case 4:
gobj_vegetables.masalapowders();
break;
case 5:
gobj_vegetables.checkout();
break;

}

default:
System.out.println("You have entered an invalid option");
gobj_vegetables.vegetables();
break;
}
}


void cosmetics()
{
Groceries gobj_cosmetics = new Groceries();
System.out.println("Welcome to Cosmetics section");
System.out.println("Please choose your favourite Cosmetic category from below list:");
System.out.println("Product_Code, Product_Name, Price(for 1 piece)");
System.out.println("145,          Shampoo,      100");
System.out.println("146,          Moisturizer,   60");
System.out.println("147,          Face Wash,     50");
System.out.println("148,          Face Cream,    80");
System.out.println("Please enter the Product_Code of the cosmetic you wish to buy");
int prdt_code=sc.nextInt();
switch(prdt_code)
{
case 145:
System.out.println("Please enter how much quantity(in number) you wish to buy");
int shampoo_quant=sc.nextInt();
shampoo_bill+= (shampoo_quant*100);
System.out.println("Your bill for "+shampoo_quant+" quantity of Shampoo is: "+shampoo_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg3=sc.nextInt();
switch(fav_catg3)
{
case 1:
gobj_cosmetics.fruits();
break;
case 2:
gobj_cosmetics.vegetables();
break;
case 3:
gobj_cosmetics.cosmetics();
break;
case 4:
gobj_cosmetics.masalapowders();
break;
case 5:
gobj_cosmetics.checkout();
break;

}
break;

case 146:
System.out.println("Please enter how much quantity(in number) you wish to buy");
int moisturizer_quant=sc.nextInt();
moisturizer_bill+= (moisturizer_quant*100);
System.out.println("Your bill for "+moisturizer_quant+" quantity of Moisturizer is: "+moisturizer_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg4=sc.nextInt();
switch(fav_catg4)
{
case 1:
gobj_cosmetics.fruits();
break;
case 2:
gobj_cosmetics.vegetables();
break;
case 3:
gobj_cosmetics.cosmetics();
break;
case 4:
gobj_cosmetics.masalapowders();
break;
case 5:
gobj_cosmetics.checkout();
break;

}
break;
case 147:
System.out.println("Please enter how much quantity(in number) you wish to buy");
int facewash_quant=sc.nextInt();
facewash_bill+= (facewash_quant*100);
System.out.println("Your bill for "+facewash_quant+" quantity of Facewash is: "+facewash_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg5=sc.nextInt();
switch(fav_catg5)
{
case 1:
gobj_cosmetics.fruits();
break;
case 2:
gobj_cosmetics.vegetables();
break;
case 3:
gobj_cosmetics.cosmetics();
break;
case 4:
gobj_cosmetics.masalapowders();
break;
case 5:
gobj_cosmetics.checkout();
break;

}
break;
case 148:
System.out.println("Please enter how much quantity(in number) you wish to buy");
int facecream_quant=sc.nextInt();
facecream_bill+= (facecream_quant*100);
System.out.println("Your bill for "+facecream_quant+" quantity of Facewash is: "+facecream_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg6=sc.nextInt();
switch(fav_catg6)
{
case 1:
gobj_cosmetics.fruits();
break;
case 2:
gobj_cosmetics.vegetables();
break;
case 3:
gobj_cosmetics.cosmetics();
break;
case 4:
gobj_cosmetics.masalapowders();
break;
case 5:
gobj_cosmetics.checkout();
break;
}


default:
System.out.println("You have entered an invalid option");
gobj_cosmetics.cosmetics();
break;
}
}
void masalapowders()
{
Groceries gobj_masalapowders = new Groceries();
System.out.println("Welcome to Masala Powders section");
System.out.println("Please choose your favourite Masal powder from below list:");
System.out.println("Product_Code, Product_Name,   Price(for 1_packet(250gm))");
System.out.println("155,          Chicken Masala, 80");
System.out.println("156,          Curry Masala,   60");
System.out.println("157,          Garam Masala,   80");
System.out.println("158,          Fish Masala,    90");
System.out.println("Please enter the Product_Code of the masalapowder you wish to buy");
int prdt_code=sc.nextInt();
switch(prdt_code)
{
case 155:
System.out.println("Please enter how many packets you wish to buy");
int chicken_masala_pack=sc.nextInt();
chicken_masala_bill+= (chicken_masala_pack*80);
System.out.println("Your bill for "+chicken_masala_pack+" packets of Chicken Masala is: "+chicken_masala_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg3=sc.nextInt();
switch(fav_catg3)
{
case 1:
gobj_masalapowders.fruits();
break;
case 2:
gobj_masalapowders.vegetables();
break;
case 3:
gobj_masalapowders.cosmetics();
break;
case 4:
gobj_masalapowders.masalapowders();
break;
case 5:
gobj_masalapowders.checkout();
break;

}
break;
case 156:
System.out.println("Please enter how much quantity(in number) you wish to buy");
int curry_masala_pack=sc.nextInt();
curry_masala_bill+= (curry_masala_pack*100);
System.out.println("Your bill for "+curry_masala_pack+" packets of Curry Masala is: "+curry_masala_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg5=sc.nextInt();
switch(fav_catg5)
{
case 1:
gobj_masalapowders.fruits();
break;
case 2:
gobj_masalapowders.vegetables();
break;
case 3:
gobj_masalapowders.cosmetics();
break;
case 4:
gobj_masalapowders.masalapowders();
break;
case 5:
gobj_masalapowders.checkout();
break;

}
break;
case 157:
System.out.println("Please enter how many packets you wish to buy");
int garam_masala_pack=sc.nextInt();
garam_masala_bill+= (garam_masala_pack*100);
System.out.println("Your bill for "+garam_masala_pack+" packets of Garam Masala is: "+garam_masala_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg4=sc.nextInt();
switch(fav_catg4)
{
case 1:
gobj_masalapowders.fruits();
break;
case 2:
gobj_masalapowders.vegetables();
break;
case 3:
gobj_masalapowders.cosmetics();
break;
case 4:
gobj_masalapowders.masalapowders();
break;
case 5:
gobj_masalapowders.checkout();
break;

}
break;
case 158:
System.out.println("Please enter how many packets you wish to buy");
int fish_masala_pack=sc.nextInt();
fish_masala_bill+= (fish_masala_pack*100);
System.out.println("Your bill for "+fish_masala_pack+" packets of Fish Masala is: "+fish_masala_bill);
System.out.println("Do you want to purchase our other items:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int fav_catg8=sc.nextInt();
switch(fav_catg8)
{
case 1:
gobj_masalapowders.fruits();
break;
case 2:
gobj_masalapowders.vegetables();
break;
case 3:
gobj_masalapowders.cosmetics();
break;
case 4:
gobj_masalapowders.masalapowders();
break;
case 5:
gobj_masalapowders.checkout();
break;

}

default:
System.out.println("You have entered an invalid option");
gobj_masalapowders.masalapowders();
break;

}
}
void checkout()
{
Groceries gobj_checkout = new Groceries();
double total_bill1=(mango_bill+apple_bill+banana_bill+papaya_bill+grapes_bill+orange_bill+onion_bill)+(onion_bill+mirchi_bill+brinjal_bill+carrot_bill)+(shampoo_bill+moisturizer_bill+facewash_bill+facecream_bill)+(chicken_masala_bill+curry_masala_bill+garam_masala_bill+fish_masala_bill

);


if(total_bill1>500)
{
double final_bill=((total_bill1*10)/100);
System.out.println("You have saved "+final_bill+"rs");
System.out.println("Your total bill: "+(total_bill1-final_bill));
System.out.println("Thanks for shopping with us");
System.out.println("Please visit again...");
System.out.println("Java is Awesome!!");

}
else {
System.out.println("Your total bill: "+(total_bill1));
System.out.println("You can avail a discount of 10% on your Total Bill if your Total Bill is greater than 500");
System.out.println("If you wish to shop more,Please choose from below options");
System.out.println("Thanks for shopping with us");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
System.out.println("5) Exit & Checkout");
int else_opt=sc.nextInt();
if(else_opt<=4)
{
switch(else_opt)
{
case 1:
gobj_checkout.fruits();
break;
case 2:
gobj_checkout.vegetables();
break;
case 3:
gobj_checkout.cosmetics();
break;
case 4:
gobj_checkout.masalapowders();
break;
default:
System.out.println("You have entered an invalid option");
System.out.println("Please choose your category of shopping from below options:");
System.out.println("Please enter the option number you wish to buy from below options:");
System.out.println("1) Fruits");
System.out.println("2) Vegetables");
System.out.println("3) Cosmetics");
System.out.println("4) Masala Powders");
int fav_catg2=sc.nextInt();
switch(fav_catg2)
{
case 1:
gobj_checkout.fruits();
break;
case 2:
gobj_checkout.vegetables();
break;
case 3:
gobj_checkout.cosmetics();
break;
case 4:
gobj_checkout.masalapowders();
break;
}
}
}
else
{
System.out.println("Your total bill: "+(total_bill1));
System.out.println("Please visit again...");
System.out.println("Java is Awesome!!");
}
}
}

public static void main(String[] args)
{
Groceries gobj = new Groceries();
gobj.menu();
}
}
