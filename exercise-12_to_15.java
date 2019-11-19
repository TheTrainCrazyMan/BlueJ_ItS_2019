//Exercise 12
GoTeam();
System.out.println("/n");
GoTeam();
BestWest();
GoTeam();
System.out.println("/n");
GoTeam();
BestWest();
GoTeam();
System.out.println("/n");

public static void GoTeam()
{
  System.out.println("Go, team, go!");
  System.out.println("You can do it.");
}

public static void BestWest()
{
  System.out.println("You're the best,");
  System.out.println("In the West.");
}

//Exercise 14
3Rows();
System.out.println("/n");
3Rows();
Line();
StarLine();
Line();
3Rows();
System.out.println("/n");
3Rows();
SmallLine();
StarLine();
StarLine();
SmallLine();
SmallLine();

public static void 3Rows()
{
 System.out.println("    *****    ")
 System.out.println("  *********  ")
 System.out.println("*************")
}

public static void Line()
{
  System.out.println("*************")
}

public static void StarLine()
{
  System.out.println("* | | | | | *")
}

public static void SmallLine()
{
  System.out.println("    *****    ")
}

//Exercise 15
HalfTop();
HalfBottom();
HalfBottom();
PlusLine();
System.out.println("/n");
HalfTop();
Stop();
HalfBottom();
System.out.println("/n");
HalfTop();
PlusLine();

public static void HalfTop()
{
  System.out.println("   ________   ")
  System.out.println(" //         \ ")
  System.out.println("//           \")
}

public static void HalfBottom()
{
  System.out.println("\            //")
  System.out.println(" \__________// ")
}

public static void PlusLine()
{
  System.out.println(" +-----------+ ")
}

public static void Stop()
{
  System.out.println("|     STOP    |")
}
