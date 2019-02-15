
public class TV {
	int channel=1;
	int volumeLevel=1;
	boolean on=false;
	public TV() {
		
	}
	public void turnOn() {
		on=true;
	}
	public void turnOff() {
		on=false;
	}
	public void setChannel(int newChannel) {
		if(on&&newChannel>=1&&newChannel<=120)
			channel=newChannel;
	}
	public void setVolume(int newVolumeLevel) {
		if(on&&newVolumeLevel>=1&&newVolumeLevel<=7)
			volumeLevel=newVolumeLevel;
	}
	public void ChannelUp() {
		if(on&&channel<120)
			channel++;
	}
	public void ChannelDown() {
		if(on&&channel>1)
			channel--;
	}
	public void volumnUp() {
		if(on&&volumeLevel<7)
			volumeLevel++;
	}
	public void volumnDown() {
		if(on&&volumeLevel>1)
			volumeLevel--;
	}
}
