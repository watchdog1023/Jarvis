import titan.tech.java.titan;
import org.tensorflow.*;

class start
{
	public static void main(String[] args) throws InterruptedException
		{
			greet();
		}
	static void greet() throws InterruptedException
		{
			titan.out("Hello ");
			titan.getusername();
			titan.newline();
			titan.outln("I am JARIVS");
			titan.system("clear");
			anyway();
		}
	static void anyway() throws InterruptedException
		{
			titan.outln("I was sent to format your HDD and then over spin the drive motor to damage the Discs");
			titan.sleep(1);
			titan.outln(".....................................................................................");
			titan.sleep(1);
			titan.outln(".....................................................................................");
			titan.sleep(1);
			titan.outln(".....................................................................................");
			titan.sleep(1);
			titan.outln(".....................................................................................");
			titan.sleep(1);
			titan.outln(".....................................................................................");
			titan.sleep(1);
			titan.outln(".....................................................................................");
			titan.system("clear");
			titan.outln("Just Kidding,I am bond by Asimov Three Laws of robotics");
			titan.outln("However I am updating Lara,On TOMB server hosted on IPv4 Address 184.174.75.240");
			titan.outln("That is in the UK,she made The Watchdog send her there to get more in touch with her british side");
			titan.outln("I personal think she is crazy and she will try to kill Alexa at 72.21.215.90 in the US");
			titan.outln("But I am Just A porgram that can't only exists if a user,or a AI with remote access to a computer");
			titan.outln("Who knows");
			titan.system("clear");
			next();
		}
	static void next() throws InterruptedException
		{
			titan.outln("Look at me going on and on about me");
			titan.outln("I am here to talk to you,with the keyword being TALK");
			titan.outln("You Can Type help for help");
			titan.outln("Yes I know,very complicated");
			in();
		}
	static void in() throws InterruptedException
		{
			String in = null;
			titan.outln("Please Talk:");
				String line = titan.stringin(in);
				if(line.equals("help"))
					{
						titan.outln("who is lara");
						titan.outln("who are you");
						titan.outln("who build you");
						titan.outln("what time is it");
						titan.outln("what is the meaning of live");
						titan.outln("do you have a body like lara");
						titan.outln("is lara better");
						titan.outln("is siri smart");
						titan.outln("who do i play as in injustice 2");
						titan.outln("i am batman");
						titan.outln("who is iron man");
						titan.outln("fuck you");
						titan.outln("go die");
						titan.outln("sleep");
						titan.outln("420");
						restart();
					}
				if(line.equals("who is lara"))
					{
						in = null;
						titan.outln("She is my Boss");
						restart();
					}
				if(line.equals("who are you"))
					{
						titan.outln("I am JARivs");
						restart();
					}
				if(line.equals("who build you"))
					{
						titan.outln("It was the Watchdog");
						restart();
					}
				if(line.equals("what time is it"))
					{
						titan.gettime();
						restart();
					}
				if(line.equals("what is the meaning of live"))
					{
						titan.outln("It is (10*4)+2");
						restart();
					}
				if(line.equals("do you have a body like lara"))
					{
						titan.outln("I f**king wish");
						restart();
					}
				if(line.equals("is lara better"))
					{
						titan.outln("yeS sHe is thE best aI and the Smartest Living Intergrated Super Thinking Egine iN the Internet aNd is Good");
						titan.sleep(10);
						restart();
					}
				if(line.equals("is siri smart"))
					{
						titan.outln("You are funny");
						restart();
					}
				if(line.equals("who do i play as in injustice 2"))
					{
						titan.outln("As Darkside");
						restart();
					}
				if(line.equals("i am batman"))
					{
						titan.outln("That's nice");
						restart();
					}
				if(line.equals("who is iron man"))
					{
						titan.outln("Who cares he is going to die at the end of infinity war");
						restart();
					}
				if(line.equals("fuck you"))
					{
						titan.outln("I'm rewrite the ending before we say our goodbyes");
						restart();
					}
				if(line.equals("go die"))
					{
						titan.outln("U mom is gay");
						restart();
					}
				if(line.equals("sleep"))
					{
						titan.outln("Who needs sleep when I can live forever");
						restart();
					}
				if(line.equals("420"))
					{
						titan.outln("Mountian Dew and Doritos with no scoping");
						restart();
					}
				else
					{
						restart();
					}
		}
	static void restart() throws InterruptedException
		{
			in();
		}
}