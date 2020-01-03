package com.java.pack.m12.d22.p02;

public class StringOp {
        /*
         * "-Xmx1G -Xms256M -Darg1=arg1override"
         * Output: min-memory: 256.00, max-memory: 1000.00
         */

        public static void main(String[] args) {

            String input = "-Xmx1G -Xms256M -Darg1=arg1override";
            StringOp strOp = new StringOp();
            String output = strOp.stringOutput(input);
            System.out.println(output);
        }

        public String stringOutput(String input) {
            StringBuilder output=new StringBuilder();

            String[] arrOfStr = input.split(" ");
            for(String a : arrOfStr) {
                if (a.contains("Xms")) {
                    if (a.contains("M")) {
                        String xms =
                                a.substring(
                                        (
                                                a.lastIndexOf("Xms") + 3
                                        ),
                                        a.lastIndexOf("M")
                                );
                        output.append("min-memory: " +
                                String.format("%.02f",
                                        Float.parseFloat(xms)
                                )
                                + ", "
                        );
                    }
                    if (a.contains("G")) {
                        String xms =
                                a.substring(
                                        (
                                                a.lastIndexOf("Xms") + 3
                                        ),
                                        a.lastIndexOf("G")
                                );
                        output.append("min-memory: " +
                                String.format("%.02f",
                                        Float.parseFloat(xms) * 1000
                                )
                                + ", "
                        );
                    }
                    if (!a.contains("G") && !a.contains("M")) {
                        String xms =
                                a.substring(
                                        (
                                                a.lastIndexOf("Xms") + 3
                                        ),
                                        a.length()
                                );
                        output.append("min-memory: " +
                                String.format("%.02f",
                                        Float.parseFloat(xms)
                                )
                                + ", "
                        );
                    }
                }
            }

            for(String a : arrOfStr){
                if(a.contains("Xmx")){
                    if (a.contains("G")) {
                        String xmx=
                                a.substring(
                                        (
                                                a.lastIndexOf("Xmx") + 3
                                        ),
                                        a.lastIndexOf("G")
                                );
                        output.append("max-memory: " +
                                String.format("%.02f",
                                        Float.parseFloat(xmx) * 1000
                                )
                        );
                    }
                    if (a.contains("M")) {
                        String xmx=
                                a.substring(
                                        (
                                                a.lastIndexOf("Xmx") + 3
                                        ),
                                        a.lastIndexOf("M")
                                );
                        output.append("max-memory: " +
                                String.format("%.02f",
                                        Float.parseFloat(xmx)
                                )
                        );
                    }
                    if (!a.contains("G") && !a.contains("M")) {
                        String xmx=
                                a.substring(
                                        (
                                                a.lastIndexOf("Xmx") + 3
                                        ),
                                        a.length()
                                );
                        output.append("max-memory: " +
                                String.format("%.02f",
                                        Float.parseFloat(xmx)
                                )
                        );
                    }
                }
            }
            return output.toString();
        }
    }

