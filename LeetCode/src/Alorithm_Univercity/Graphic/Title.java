//package org.example;
//
//import com.sun.j3d.utils.universe.SimpleUniverse;
//
//import javax.media.j3d.*;
//import javax.swing.*;
//import javax.vecmath.*;
//import java.awt.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//public class Title {
//
//    public static void main(String[] args) {
//        Title t = new Title();
//        t.setUp();
//    }
//
//    public void setUp() {
//        JFrame jf = new JFrame("Welcome");
//        // kill the window on close
//        jf.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent winEvent) {
//                System.exit(0);
//            }
//        });
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(1, 1, 2, 2));
//
//        GraphicsConfiguration config = SimpleUniverse
//                .getPreferredConfiguration();
//        Canvas3D canvas3D = new Canvas3D(config);
//        canvas3D.setSize(1440, 1000);
//        SimpleUniverse universe = new SimpleUniverse(canvas3D);
//        BranchGroup group = new BranchGroup();
//        addObjects(group);
//        addLights(group);
//        universe.getViewingPlatform().setNominalViewingTransform();
//        universe.addBranchGraph(group);
//        panel.add(canvas3D);
//        jf.getContentPane().add(panel, BorderLayout.CENTER);
//        jf.pack();
//        jf.setVisible(true);
//    }
//
//    public void addLights(BranchGroup group) {
//        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0),
//                1000.0);
//
//        Color3f light1Color = new Color3f(1.0f, 1.0f, 1.0f);
//        Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);
//        DirectionalLight light1 = new DirectionalLight(light1Color,
//                light1Direction);
//        light1.setInfluencingBounds(bounds);
//        group.addChild(light1);
//
//        // Set up the ambient light
//        Color3f ambientColor = new Color3f(.1f, .1f, .1f);
//        AmbientLight ambientLightNode = new AmbientLight(ambientColor);
//        ambientLightNode.setInfluencingBounds(bounds);
//        group.addChild(ambientLightNode);
//    }
//
//    private void addObjects(BranchGroup group) {
//        Font3D f3d = new Font3D(new Font("TestFont", Font.PLAIN, 2),
//                new FontExtrusion());
//        Text3D text = new Text3D(f3d, new String("Jumayev"), new Point3f(-3.5f,
//                -.5f, -4.5f));
//
//        text.setString("      J  B");
//        Color3f white = new Color3f(1.0f, 1.0f, 1.0f);
//        Color3f blue = new Color3f(.2f, 0.2f, 0.6f);
//        Appearance a = new Appearance();
//        Material m = new Material(blue, blue, blue, white, 80.0f);
//        m.setLightingEnable(true);
//        a.setMaterial(m);
//
//        Shape3D sh = new Shape3D();
//        sh.setGeometry(text);
//        sh.setAppearance(a);
//        TransformGroup tg = new TransformGroup();
//        Transform3D t3d = new Transform3D();
//        Transform3D tDown = new Transform3D();
//        Transform3D rot = new Transform3D();
//        Vector3f v3f = new Vector3f(-1.6f, -1.35f, -6.5f);
//        t3d.setTranslation(v3f);
//        rot.rotX(Math.PI / 5);
//        t3d.mul(rot);
//        v3f = new Vector3f(0, -1.4f, 0f);
//        tDown.setTranslation(v3f);
//        t3d.mul(tDown);
//        tg.setTransform(t3d);
//        tg.addChild(sh);
//        group.addChild(tg);
//
//    }
//}