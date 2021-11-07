package neewPackage;

public class Television {
    private boolean power;
    private int channel = 1;
    private int volume = 1;



    public Television(boolean power, int channel, int volume){
        this.channel = channel;
        this. volume = volume;
       this.power = power;

    }

    public Television() {

    }

    public void setPowerOn(boolean turnOn) {
        if (turnOn == true) {

            power = true;

        }
    }

        public void setPowerOff(boolean turnOff){

            if (turnOff == false) {


                 power = false;
            }

        }

        public boolean getPower(){
        return  power;
        }

        public void setVolume(int volume){
        if ( power == true && volume >= 1 || volume <= 10){
            this.volume = volume;
        }
        }

        public void setIncreaseVolume(int volume){
            if ( power == true && volume <  10){

                volume++;
                this.volume = volume;
            }
        }

        public void setDecreaseVolume(int volume){
        if ( power == true && volume > 1){
            volume--;
            this.volume = volume;
        }
        }

        public int getVolume(){
        return volume;
        }


        public void setChannel(int channel){
            if ( power == true && channel >=  1 || channel <120){
                this.channel = channel;
            }

        }

        public void increaseChannel(int channel){
        if ( power == true && channel < 120){
            channel++;
        }
        }

        public void setDecreaseChannel (int channel){
        if (power == true && channel > 1){
            channel--;
            this.channel = channel;
        }
        }

        public int getChannel(){
        return channel;
        }




    }


