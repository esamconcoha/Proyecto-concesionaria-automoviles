
package proyectoalgoritmos;


import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author user123
 */
public class Proyectoalgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		String acce="" ;
		String accel="" ;
		String accet ="";
		float ae = 0;
		double ai = 0;
		String amenidades= "";
		double amenidadprecio = 0;
		double ar = 0;
		String aro="" ;
		double automovil = 0;
		double ax = 0;
		String c="" ;
		String co="";
		double color = 0;
		int enter=0;
		double op;
		double op1;
		double op1a;
		int op2;
		double op3;
		int op31;
		int op31a;
		double r1 = 0;
		double repetidorauto;
		String t ="";
		String tap="" ;
		double tpc = 0;
		double transmision = 0;
		double verdad;
		double verdadamena;
                //Declaracion de variables
		verdad = 1;//variable asignada para el ciclo del menú principal
		while (verdad==1) {//Inicio de ciclo de menú principal
			System.out.println("CONCESIONARIA DE AUTOS");
			System.out.println("--Menú Principar--");
			System.out.println("1.-seleccionar automovil");
			System.out.println("2.-Salir");
			System.out.println("Ingrese la opcion(segun su numero) que desee ejecutar");
			op1 = scan.nextInt();
			if (op1==1) {//evaluación lógica para ejecutar las acciones impresas en pantalla
				repetidorauto = 1;//variable asignada para el menú de gama de autos
				while (repetidorauto==1) {//inicio de ciclo para el menú de Gama de autos
					System.out.println("1.-Sedan economico");
					System.out.println("2.-Sedan ");
					System.out.println("3.-Deportivo");
					System.out.println("4.-Híbrido");
					System.out.println("5.-coupe");
					System.out.println("6.-coupe deportivo");
					System.out.println("7.-compacto");
					System.out.println("8.-Hatchback");
					System.out.println("9.-economico version rally");
					System.out.println("10.-regresar a menú principa");
					System.out.println("Ingrese gama de vehiculo");
					op2 = scan.nextInt();
					switch (op2) {//despliegue de las posibles acciones de las opciones del menú(según la opcion que haya elegido el usuario)
					case 1://se describen las acciones a realizar dependiendo la opcion que haya elegido el usuario
						automovil = 18940.00;
						c = "sedan economico";
						System.out.println("ha seleccionado la gama: sedan económico");
						break;
					case 2:
						automovil = 23570.00;
						c = "sedan";
						System.out.println("ha seleccionado la gama: Sedan");
						break;
					case 3:
						automovil = 24100.00;
						c = "deportivo";
						System.out.println("ha seleccionado la gama: deportivo");
						break;
					case 4:
						automovil = 25100.00;
						c = "híbrido";
						System.out.println("ha seleccionado la gama: Híbrido");
						break;
					case 5:
						automovil = 19350.00;
						c = "coupe";
						System.out.println("ha seleccionado la gama: coupe");
						break;
					case 6:
						automovil = 24100.00;
						c = "Coupe deportivo";
						System.out.println("ha seleccionado la gama: coupe deportivo");
						break;
					case 7:
						automovil = 16190.00;
						c = "compacto";
						System.out.println("ha seleccionado la gama: compacto");
						break;
					case 8:
						automovil = 20150.00;
						c = "hatchback";
						System.out.println("ha seleccionado la gama: Hatchback");
						break;
					case 9:
						automovil = 34700.00;
						c = "económico versión rally";
						System.out.println("ha seleccionado la gama: económico versión rally");
						break;
					case 10:
						verdad = 1;
						System.out.println(""); // no hay forma directa de borrar la consola en Java
						break;
					}
					if (op2==10) {
						repetidorauto = 0;
					} else {
						verdad = 0;//se coloca la variable verdad=0 para indicar que se sigue con el programa (ya que de ser verdad=1 se regresa a menú principal)
						System.out.println("¿desea agregar amenidades?(seleccione numero de opcion)");
						System.out.println("1.-si");
						System.out.println("2.-no");
						op3 = scan.nextInt();
						if (op3==1) {//se evalua la opción elegida por el usuario para desencadenar la acción, en este caso si quiere agregar amenidades o no
							verdadamena = 1;//se asigna esta variable para el ciclo correspondiente al menú de amenidades
							while (verdadamena==1) {//con while y verdadamena=1 se da inicio al ciclo para el menú de amenidades
								System.out.println("--tipos de amenidades--");
								System.out.println("1.-tipos de transmision");
								System.out.println("2.-color de pintura exterior");
								System.out.println("3.-color de tapiceria");
								System.out.println("4.-aros");
								System.out.println("5.-accesorios exteriores");
								System.out.println("6.-accesorios interiores");
								System.out.println("7.-accesorios electronicos");
								System.out.println("8.-regresar a selección de gama de vehículos");
								op31 = scan.nextInt();
								switch (op31) {//se coloca switch para describir las acciones de cada posible caso que elija el usuario
								case 1:
									System.out.println("--tipos de transmisión--");
									System.out.println("1.-manual                us$ 0.00");
									System.out.println("2.-CTV                   us$ 800.00");
									System.out.println("3-manual con turbo       us$ 0.00");
									System.out.println("4.-CTV con turbo         us$ 800.00");
									System.out.println("5.-Regresar a la seleccion de amenidades");
									op31a = scan.nextInt();
									switch (op31a) {//se asigna un switch anidado ya que en este caso al elegir alguna de las opciones del menú de amenidades estas opciones contienen subopciones a elegir y cada una de estas tiene una accion correspondiente
									case 1:
										transmision = 0;//se asigna una variable para el precio de la transmision elegida
										t = "transmision manual";//se asigna variable para que se pueda mostrar el nombre de la transmision elegida
										System.out.println("transmision manual");
										break;
									case 2:
										transmision = 800;
										t = "transmision CTV";
										System.out.println("transmision CTV");
										break;
									case 3:
										transmision = 0;
										t = "transmision manual con turbo";
										System.out.println("transmision manual con turbo");
										break;
									case 4:
										transmision = 800;
										t = "transmision CTV con turbo";
										System.out.println("transmision CTV con turbo");
										break;
									case 5:
										verdadamena = 1;//se usa esta variable para indicar de que al elegirse la opcion 5 se regresa al menú de amenidades
										break;
									}
									amenidades = amenidades+","+t;//se declara la variable amenidades para almacenar el nombre de todas las amenidades que se vayan eligiendo y mostralas en pantalla(junto con otras posibles amenidades que se hayan elegido anteriormente)
									break;
								case 2:
									System.out.println("--color de pintura exterior--");
									System.out.println("1.-cosmic blue          us$ 0.00");
									System.out.println("2.-Burgundy Night       us$ 0.00");
									System.out.println("3.-Rallye Red           us$ 0.00");
									System.out.println("4.-Crystal Black        us$ 0.00");
									System.out.println("5.-Modern Steel         us$ 0.00");
									System.out.println("6.-Taffeta White        us$ 0.00");
									System.out.println("7.-Energy Green         us$ 0.00");
									System.out.println("8.-Kona coffee          us$ 0.00");
									System.out.println("9.-Orange Fury          us$ 0.00");
									System.out.println("10.-Helios Yellow us$   us$ 0.00");
									System.out.println("11.-Sonic Gray          us$ 0.00");
									System.out.println("12.-Polished Metal      us$ 0.00");
									System.out.println("13.-Regresar a la seleccion de amenidades");
									op31a = scan.nextInt();
									switch (op31a) {//se utiliza un switch anidado para mostrar las acciones posibles de las subopciones que se muestran
									case 1:
										color = 0;//se usa la variable color para almacenar el precio del color de pintura exterior elegida 
										co = "color cosmic blue";//se usa co para almacenar el nombre del color de pintura elegida y mostrala en pantalla
										System.out.println("color cosmic blue");
										break;
									case 2:
										color = 0;
										co = "color burgundy Night";
										System.out.println("color burgundy night");
										break;
									case 3:
										color = 0;
										co = "color rallye red";
										System.out.println("color rallye red");
										break;
									case 4:
										color = 0;
										co = "color crystal black";
										System.out.println("color crystal black");
										break;
									case 5:
										color = 0;
										co = "color modern steel";
										System.out.println("color modern steel");
										break;
									case 6:
										color = 0;
										co = "color Taffeta White";
										System.out.println("color Taffeta White");
										break;
									case 7:
										color = 0;
										co = "color Energy Green";
										System.out.println("color Energy Green");
										break;
									case 8:
										color = 0;
										co = "color Kona coffee";
										System.out.println("color Kona coffee");
										break;
									case 9:
										color = 0;
										co = "color Orange Fury";
										System.out.println("color Orange Fury");
										break;
									case 10:
										color = 0;
										co = "color Helios Yellow";
										System.out.println("color Helios Yellow");
										break;
									case 11:
										color = 0;
										co = "color Sonic Gray";
										System.out.println("color Sonic Gray");
										break;
									case 12:
										color = 0;
										co = "color Polished Metal";
										System.out.println("color Polished Metal");
										break;
									case 13:
										verdadamena = 1;//se utiliza verdadamena=1 para volver al menú de amenidades
										break;
									}
									amenidades = amenidades+","+co;//se almacena el nombre del color elegido por el usuario en la variable amenidades, para poder mostrala en pantalla(junto con otras posibles amenidades que se hayan elegido anteriormente)
									break;
								case 3:
									System.out.println("--color de tapiceria--");
									System.out.println("1.-Gray cloth                          us$ 0.00");
									System.out.println("2.-black cloth                         us$ 0.00");
									System.out.println("3.-black/gray cloth                    us$ 0.00");
									System.out.println("4.-red/black suede effect-fabric       us$ 0.00");
									System.out.println("5.-regresar a la seleccion de amenidades");
									op31a = scan.nextInt();
									switch (op31a) {//switch anidado para las acciones posibles de las subopciones
									case 1:
										tpc = 0;//se usa la variable tpc para almacenar el precio del color de tapiceria elegido
										tap = "tapicería gray cloth";//se utiliza tap para almacenar el nombre del color de tapiceria elegido
										System.out.println("color de tapicería gray cloth");
										break;
									case 2:
										tpc = 0;
										tap = "tapicería black cloth";
										System.out.println("color de tapicería black cloth");
										break;
									case 3:
										tpc = 0;
										tap = "tapicería black/gray cloth";
										System.out.println("color de tapicería black/gray cloth");
										break;
									case 4:
										tpc = 0;
										tap = "tapicería red/black suede effect-fabric";
										System.out.println("color de tapicería red/black suede effect-fabric");
										break;
									case 5:
										verdadamena = 1;//se usa verdadamena=1 para indicar que si se elige esta opcion se vuelve al ciclo del menú de amenidades
										break;
									}
									amenidades = amenidades+", "+tap;//se agrega el nombre del color de tapiceria elegido en la variable amenidades(junto con otras posibles amenidades que se hayan elegido anteriormente)
									break;
								case 4:
									System.out.println("--aros--");
									System.out.println("1.- 15    us$ 0.00");
									System.out.println("2.- 16    us$ 0.00");
									System.out.println("3.- 17    us$ 1688.00");
									System.out.println("4.- 18    us$ 1700.00");
									System.out.println("5.- 19    us$ 3011.00");
									System.out.println("6.-regresar a la seleccion de amenidades");
									op31a = scan.nextInt();
									switch (op31a) {//switch anidado para mostrar las acciones posibles de las subopciones
									case 1:
										ar = 0;//se utiliza ar para almacenar el precio de los aros elegidos
										aro = " aro 15";//se utiliza la variable aro para almacenar el tipo de aro que se eligio 
										System.out.println("aro 15");
										break;
									case 2:
										ar = 0;
										aro = " aro 16";
										System.out.println("aro 16");
										break;
									case 3:
										ar = 1688;
										aro = " aro 17";
										System.out.println("aro 17");
										break;
									case 4:
										ar = 1700;
										aro = " aro 18";
										System.out.println("aro 18");
										break;
									case 5:
										ar = 3011;
										aro = " aro 19";
										System.out.println("aro 19");
										break;
									case 6:
										verdadamena = 1;//se utiliza verdadamena=1 para indicar que si se elige esta opcion, se regresa al ciclo del menú de amenidades
										break;
									}
									amenidades = amenidades+", "+aro;//se almacena el tipo de aro que se eligio en la variable amenidades(junto con otras posibles amenidades que se hayan elegido anteriormente)
									break;
								case 5:
									System.out.println("--accesorios exteriores--");
									System.out.println("1.- body side molding          us$ 217.00");
									System.out.println("2.- car cover                  us$ 230.00");
									System.out.println("3.- decklild spoiler           us$ 299.99");
									System.out.println("4.- door edge film             us$ 42.00");
									System.out.println("5.- door edge guards           us$ 84.00");
									System.out.println("6.- Door Trim Chrome           us$ 285.00");
									System.out.println("7.- Door Visor                 us$ 185.00");
									System.out.println("8.- Front Fender Emblems       us$ 50.00");
									System.out.println("9.- Rear Bumper Applique       us$ 70.00");
									System.out.println("10.- Fog Lights                us$ 325.00");
									System.out.println("11.- Nose Mascs                us$ 158.00");
									System.out.println("12.- Moonrof Visor             us$ 138.00");
									System.out.println("13.- Splash Guard Set          us$ 104.00");
									System.out.println("14.-  Dust Cover               us$ 350.00");
									System.out.println("15.- Door Mirror Cover - Carbon Fiber    us$ 520.00");
									System.out.println("16.- regresar a la seleccion de amenidades");
									op31a = scan.nextInt();
									switch (op31a) {//switch anidado para mostrar las posibles acciones de las subopciones de la amenidad elegida
									case 1:
										ax = 217;//se utiliza la vairable ax para almacenar el precio del accesorio exterior elegido por el usuario
										acce = "body side molding";//se utiliza la variable acce para almacenar el nombre del accesorio elegido por el usuario
										System.out.println("Accesorio exterior body side molding");
										break;
									case 2:
										ax = 230;
										acce = "car cover";
										System.out.println("Accesorio exterior car cover");
										break;
									case 3:
										ax = 299.99;
										acce = " decklild spoiler";
										System.out.println("Accesorio exterior  decklild spoiler");
										break;
									case 4:
										ax = 42;
										acce = "door edge film";
										System.out.println("Accesorio exterior door edge film");
										break;
									case 5:
										ax = 42;
										acce = "door edge guards";
										System.out.println("Accesorio exterior door edge guards");
										break;
									case 6:
										ax = 285;
										acce = "Door Trim Chrome";
										System.out.println("Accesorio exterior Door Trim Chrome");
										break;
									case 7:
										ax = 185;
										acce = "Door Door Visor";
										System.out.println("Accesorio exterior Door Visor");
										break;
									case 8:
										ax = 50;
										acce = " Front Fender Emblems";
										System.out.println("Accesorio exterior  Front Fender Emblems");
										break;
									case 9:
										ax = 70;
										acce = " Rear Bumper Applique";
										System.out.println("Accesorio exterior  Rear Bumper Applique");
										break;
									case 10:
										ax = 325;
										acce = " Fog Lights";
										System.out.println("Accesorio exterior  Fog Lights");
										break;
									case 11:
										ax = 158;
										acce = " Nose Mascs";
										System.out.println("Accesorio exterior  Nose Mascs");
										break;
									case 12:
										ax = 138;
										acce = "Moonrof Visor";
										System.out.println("Accesorio exterior  Moonrof Visor");
										break;
									case 13:
										ax = 104;
										acce = "Splash Guard Set";
										System.out.println("Accesorio exterior  Splash Guard Set");
										break;
									case 14:
										ax = 350;
										acce = " Dust Cover";
										System.out.println("Accesorio exterior  Dust Cover");
										break;
									case 15:
										ax = 350;
										acce = "Door Mirror Cover - Carbon Fiber";
										System.out.println("Accesorio exterior  Door Mirror Cover - Carbon Fiber");
										break;
									case 16:
										verdadamena = 1;//se utiliza verdadamena=1 para indicar que de ser elegida esta opcion se vuelve al ciclo del menú de amenidades
										break;
									}
									amenidades = amenidades+", "+acce;//se almacena el nombre del accesorio exterior en la variable amenidades (junto con otras posibles amenidades que se hayan elegido anteriormente)
									break;
								case 6:
									System.out.println("--accesorios interiores");
									System.out.println("1.- All-Seasons Floor Mats      us$ 142.00");
									System.out.println("2.- Automatic-Dimming Mirror    us$ 219.00");
									System.out.println("3.- Cargo Hook                  us$ 12.00");
									System.out.println("4.- Cargo Net                   us$ 49.00");
									System.out.println("5.- Console Illumination        us$ 250.00");
									System.out.println("6.- Cargo Organizer             us$ 87.00");
									System.out.println("7.- Door Panel Protector        us$ 149.00");
									System.out.println("8.- Armrest Compartiment        us$ 337.00");
									System.out.println("9.- Door Sill Trim-Illuminated  us$ 290.00");
									System.out.println("10.- Cargo Cover                us$ 166.00");
									System.out.println("11.- Cargo Liner                us$ 187.00");
									System.out.println("12.- regresar a la seleccion de amenidades");
									op31a = scan.nextInt();
									switch (op31a) {//switch anidado para mostrar las acciones posibles de las subopciones
									case 1:
										ai = 142;//se utiliza la variable ai para almacenar el costo del accesorio interno elegido
										accet = "All-Seasons Floor Mats";//se usa la variable accet para almacenar el nombre del accesorio elegido
										System.out.println("Accesorio interior All-Seasons Floor Mats");
										break;
									case 2:
										ai = 219;
										accet = "Automatic-Dimming Mirror";
										System.out.println("Accesorio interiorAutomatic-Dimming Mirror");
										break;
									case 3:
										ai = 12;
										accet = "Cargo Hook";
										System.out.println("Accesorio interiorCargo Hook");
										break;
									case 4:
										ai = 49;
										accet = "Cargo Net";
										System.out.println("Accesorio interior Cargo Net");
										break;
									case 5:
										ai = 250;
										accet = "Console Illumination";
										System.out.println("Accesorio interior Console Illumination");
										break;
									case 6:
										ai = 87;
										accet = "Cargo Organizer";
										System.out.println("Accesorio interior Cargo Organizer");
										break;
									case 7:
										ai = 149;
										accet = "Door Panel Protector";
										System.out.println("Accesorio interior Door Panel Protector");
										break;
									case 8:
										ai = 337;
										accet = "Armrest Compartiment";
										System.out.println("Accesorio interior Armrest Compartiment");
										break;
									case 9:
										ai = 290;
										accet = "Door Sill Trim-Illuminated";
										System.out.println("Accesorio interior Door Sill Trim-Illuminated");
										break;
									case 10:
										ai = 166;
										accet = "Cargo Cover";
										System.out.println("Accesorio interior Cargo Cover");
										break;
									case 11:
										ai = 187;
										accet = "Cargo Cargo Liner";
										System.out.println("Accesorio interior Cargo Liner");
										break;
									case 12:
										verdadamena = 1;//se indica verdadamena=1 ya que de ser elegida esta opcion se regresa al menú de amenidades
										break;
									}
									amenidades = amenidades+", "+accet;//se almacena el nombre del accesorio interno elegido en la variable amenidades(junto con otras posibles amenidades que se hayan elegido anteriormente)
									break;
								case 7:
									System.out.println("--accesorios electronicos--");
									System.out.println("1.- Wireless Phone Charger    us$ 305.00");
									System.out.println("2.- USB Charger - 2.1 Amp.    us$ 120.00");
									System.out.println("3.- Puddle Light              us$ 185.00");
									System.out.println("4.- Parking Sensors           us$ 514.00");
									System.out.println("5.- regresar a la selección de amenidades");
									op31a = scan.nextInt();
									switch (op31a) {//switch anidado para describir las acciones posibles de las subopciones
									case 1:
										ae = 305;//se usa la variable ae para almacenar el costo del accesorio electronico elegido
										accel = "Wireless Phone Charger";//se usa la variable accel para almacenar el nombre del accesorio electronico elegido
										System.out.println("accesorio electronico Wireless Phone Charger");
										break;
									case 2:
										ae = 120;
										accel = "USB Charger - 2.1 Amp.";
										System.out.println("accesorio electronico USB Charger - 2.1 Amp.");
										break;
									case 3:
										ae = 185;
										accel = "Puddle Light";
										System.out.println("accesorio electronico Puddle Light");
										break;
									case 4:
										ae = 514;
										accel = "Parking Sensors";
										System.out.println("accesorio electronico Parking Sensors");
										break;
									case 5:
										verdadamena = 1;//se utiliza verdadamena=1 para expresar que si se elige esta opcion se regresa al ciclo del menu de amenidades
										break;
									}
									amenidades = amenidades+", "+accel;//se almacena el nombre del accesorio electronico elegido en la variable amenidades(junto con otras posibles amenidades que se hayan elegido anteriormente)
									break;
								case 8:
									verdadamena = 2;//se utiliza esta variable para indicar que se sale del ciclo del menú de amenidades
									repetidorauto = 1;//se utiliza repetidorauto=1 para redirigir al usuario al menú de gama de automoviles
									r1 = 1;
									break;
								}
    								amenidadprecio = amenidadprecio+transmision+color+tpc+ar+ax+ai+ae;//se almacena en la variable amenidadprecio, la suma del costo de las amenidades que se hayan elegido
								if ((op31==8)) {//se evalua op31 para volver al ciclo del menú de gama de automoviles
									repetidorauto = 1;
                                                                        if (amenidades==""){//se utiliza esta evaluacion para colocar comas por cada amenidad elegida(de modo que haya un espacio diferenciador entre una y otra)
                                                                           amenidades=amenidades+""; 
                                                                        }
								} else {//si no se vuelve al ciclo del menú de gama de automoviles se prosigue con el programa y se muestra la gama de auto elegida, las amenidades elegidas, y la suma a pagar por ambas cosas
									r1 = 0;
                                                                     double   totaltotal=automovil+amenidadprecio;//se declara una variable para almacenar el total de la suma entre las amenidades y el automovil elegido
									System.out.println("gama seleccionada: "+c+" :   "+automovil);//se imprime el automovil y su precio
									System.out.println("amenidades: ");
									System.out.println(amenidades);//se imprime las amenidades elegidas
									System.out.println("total: "+totaltotal);//se imprime la suma total
									System.out.println("¿desea agregar más amenidades?");
									System.out.println("1.-sí");
									System.out.println("2.-no");
									verdadamena = scan.nextInt();
									if (verdadamena==2) {//se evalua verdadamena ya que de ser un resultado diferente a 1 se sale del ciclo del menú de amenidades y se da un resultado definitivo que es el que se encuentra dentro del if
										System.out.println("gama seleccionada: "+c+" :   "+automovil);
										System.out.println("amenidades: ");
										System.out.println(amenidades);
										System.out.println("total: "+totaltotal);
										System.out.println("presione la tecla 1 para volver al menú principal");
										enter = scan.nextInt();
										verdad = 1;//se undica verdad=1 luego de leer enter para regresar al usuario al ciclo del menú principal
										repetidorauto = 0;//se utiliza esta variable para indicar el fin del ciclo del menú de autos
										System.out.println(""); 
									}
								}
							}
							if (r1==1) {//se evalua r1 para verificar si se redirige al ciclo del menú de autos 
								repetidorauto = 1;
							} else {
								repetidorauto = 0;//se indica el fin del ciclo del menú de gama de autos para esta opcion
							}
						} else {//si no se eligen amenidades se muestra este resultado (es decir es la otra parte del si que iniciaba al hacerle esta pregunta al usuario : "¿desea agregar amenidades?"
							System.out.println("gama seleccionada: "+c);
							System.out.println("total: "+automovil);
							System.out.println("presione la tecla 1 para volver al menú principal");
							enter = scan.nextInt();
							verdad = 1;//se indica con verdad=1 que se regresa al ciclo del menú principal
							repetidorauto = 0;//se indica el limite del ciclo del menú de gama de autos para esta opcion
							System.out.println(""); // no hay forma directa de borrar la consola en Java
						}
					}
				}
			} else {
				verdad = 0;//se indica el fin del ciclo del menú principal (este limite está marcado en el "sino" o "else" del primer sí es decir de la primera evaluacion que se realizo dentro del programa
			}
		}
    }
    
}
