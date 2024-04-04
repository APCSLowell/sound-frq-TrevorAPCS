import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    /* to be implemented in part (a) */
    int changed = 0;
    for(int i = 0; i < samples.lengthl i++){
      if(samples[i] > limit){
        samples[i] = limit;
        changed++
      }else if(samples[i] < -limit){
        samples[i] = -limit;
        changed++;
      }
    }
    return changed;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    /* to be implemented in part (b) */
    int num0s = 0;
    for(int i = 0; i < samples.length; i++){
      if(samples[i] == 0){
        num0s++;
      }else{
        break;
      }
    }
    int[] ans = new int[samples.length - num0s];
    for(int i = 0; i < ans.length; i++){
      ans[i] = samples[i + num0s];
    }
    samples = ans;
  }
}
