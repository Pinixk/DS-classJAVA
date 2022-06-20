public class Tv {
   char channel; // default = ''
   int volume; // default = 0
   boolean sw; // default = false

   void power() {
       sw = !sw;
   }
}
