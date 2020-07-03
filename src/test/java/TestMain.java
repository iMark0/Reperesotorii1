

import org.junit.Assert;
import org.junit.Test;

public class TestMain {

        @Test
        public void testInsertToEmptyTree() {
            Main t1 = new Main();
            t1.insert(1);
            Assert.assertEquals(1, t1.mRoot.mValue);
        }
    

        @org.junit.Test
        public void testSingleRotateLeft() {
            Main t1 = new Main(10);
            t1.insert(14, 56);
            Assert.assertEquals(t1.mRoot.mValue, 14);
            Assert.assertEquals(t1.mRoot.mLeft.mValue, 10);
            Assert.assertEquals(t1.mRoot.mRight.mValue, 56);
        }

        @org.junit.Test
        public void testSingleRotateRight() {
            Main t1 = new Main(10);
            t1.insert(2, 1);
            Assert.assertEquals(t1.mRoot.mValue, 2);
            Assert.assertEquals(t1.mRoot.mLeft.mValue, 1);
            Assert.assertEquals(t1.mRoot.mRight.mValue, 10);
        }
    }

