package ex3;

import java.util.function.Supplier;

public class DurationTimer {
		private static long startCall;
		private static long stopCall;
		

		public static<T> Tuple<T, Long> measureDurationForCallInNs(Supplier<T> func) {
			//Measure time in nanoseconds (stamp before and after call)
			startCall = System.nanoTime();
			T result = func.get();
			stopCall = System.nanoTime();
			
			long duration =  stopCall-startCall;
			
			return new Tuple<T, Long>(result, duration);
		}
		
		public static <T> Tuple<T, Long> measureDurationForCallInMs(Supplier<T> func) {
			//Measure time in nanoseconds (stamp before and after call)
			startCall = System.currentTimeMillis();
			T result = func.get();
			stopCall = System.currentTimeMillis();
			
			long duration =  stopCall-startCall;
			
			return new Tuple<>(result, duration);
		}
	}
