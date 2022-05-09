import collections.HashmapDemo;
import collections.LinkedHashMapDemo;
import collections.LinkedListDemo;
import collections.LinkedListQueue;
import filesAndDirs.CreateFileExample;
import filesAndDirs.DirectoriesExample;
import filesAndDirs.PathClassExample;
import functional.FunctionalInterfaceLambdaDemo;
import functional.MethodReferenceDemo;
import functional.StreamsDemo;
import generics.*;
import io.BufferedReaderDemo;
import io.ScannerInput;
import io.TryWithResources;
import multithreading.Deadlock;
import multithreading.SynchronizedDemo;
import multithreading.ThreadRunner;
import org.junit.Test;

import java.util.stream.Stream;

public class RunAll {

    @Test
    public void runAll() throws Exception{

        String[] args = new String[0];

        //Generics
        GenericMethods.main(args);
        GenericsExample.main(args);
        LiskovSubstitution.main(args);
        VarArgs.main(args);
        Wildcards.main(args);

        //functional
        FunctionalInterfaceLambdaDemo.main(args);
        MethodReferenceDemo.main(args);
        StreamsDemo.main(args);

        //collections
        HashmapDemo.main(args);
        LinkedHashMapDemo.main(args);
        LinkedListDemo.main(args);
        LinkedListQueue.main(args);

        //threads
        ThreadRunner.main(args);
        SynchronizedDemo.main(args);
        //WARNING: CAUSES DEADLOCK
        //Deadlock.main(args);

        //io
        BufferedReaderDemo.main(args);
        ScannerInput.main(args);
        TryWithResources.main(args);

        //filesAndDirs
        CreateFileExample.main(args);
        DirectoriesExample.main(args);
        PathClassExample.main(args);
    }

}
