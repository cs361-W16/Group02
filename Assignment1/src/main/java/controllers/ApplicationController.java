/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;



//package model;

import com.google.inject.Singleton;


import model.Card;
import model.Col;
import model.Deck;
import model.Game;
import ninja.Result;
import ninja.Results;

import ninja.params.Param;
import ninja.params.PathParam;

import java.util.ArrayList;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result acesUp() {

        return Results.html().template("views/AcesUp/AcesUp.flt.html");
    }
    public Result userInput(@PathParam("input") Integer button ){
        Result result = Results.html().template("views/AcesUp/AcesUp.flt.html");
//
        Card blankCard = new Card(4, 15);
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();

        Game game = new Game(deck, col1, col2, col3, col4 );



        //Deal
        if(button == 9){
          game.Deal();


            result.render(("card11"), game.col1.getCard(0));
            result.render(("card21"), game.col2.getCard(0));
            result.render(("card31"), game.col3.getCard(0));
            result.render(("card41"), game.col4.getCard(0));

            result.render(("card12"), game.col1.getCard(1));
            result.render(("card22"), game.col2.getCard(1));
            result.render(("card32"), game.col3.getCard(1));
            result.render(("card42"), game.col4.getCard(1));

            result.render(("card13") ,game.col1.getCard(2));
            result.render(("card23"), game.col2.getCard(2));
            result.render(("card33"), game.col3.getCard(2));
            result.render(("card43"), game.col4.getCard(2));


            /*
            result.render(("card14"), game.col1.get( (col1.size())-10 ));
            result.render(("card24"), col2.get( (col2.size())-10 ));
            result.render(("card34"), col3.get( (col3.size())-10 ));
            result.render(("card44"), col4.get( (col4.size())-10 ));
            //        }else if(count == 5){
            result.render(("card15"), col1.get( (col1.size())-9 ));
            result.render(("card25"), col2.get( (col2.size())-9 ));
            result.render(("card35"), col3.get( (col3.size())-9 ));
            result.render(("card45"), col4.get( (col4.size())-9 ));
            //       }else if(count == 6){
            result.render(("card16"), col1.get( (col1.size())-8 ));
            result.render(("card26"), col2.get( (col2.size())-8 ));
            result.render(("card36"), col3.get( (col3.size())-8 ));
            result.render(("card46"), col4.get( (col4.size())-8 ));
            //       }else if(count == 7){
            result.render(("card17"), col1.get( (col1.size())-7 ));
            result.render(("card27"), col2.get( (col2.size())-7 ));
            result.render(("card37"), col3.get( (col3.size())-7 ));
            result.render(("card47"), col4.get( (col4.size())-7 ));
            //      }else if(count == 8){
            result.render(("card18"), col1.get( (col1.size())-6 ));
            result.render(("card28"), col2.get( (col2.size())-6 ));
            result.render(("card38"), col3.get( (col3.size())-6 ));
            result.render(("card48"), col4.get( (col4.size())-6 ));
            //      }else if(count == 9){
            result.render(("card19"), col1.get( (col1.size())-5 ));
            result.render(("card29"), col2.get( (col2.size())-5 ));
            result.render(("card39"), col3.get( (col3.size())-5 ));
            result.render(("card49"), col4.get( (col4.size())-5 ));
            //        }else if(count == 10){
            result.render(("card110"), col1.get( (col1.size())-4 ));
            result.render(("card210"), col2.get( (col2.size())-4 ));
            result.render(("card310"), col3.get( (col3.size())-4 ));
            result.render(("card410"), col4.get( (col4.size())-4 ));
            //       }else if(count == 11){
            result.render(("card111"), col1.get( (col1.size())-3 ));
            result.render(("card211"), col2.get( (col2.size())-3 ));
            result.render(("card311"), col3.get( (col3.size())-3 ));
            result.render(("card411"), col4.get( (col4.size())-3 ));
            //       }else if(count == 12){
            result.render(("card112"), col1.get( (col1.size())-2 ));
            result.render(("card212"), col2.get( (col2.size())-2 ));
            result.render(("card312"), col3.get( (col3.size())-2 ));
            result.render(("card412"), col4.get( (col4.size())-2 ));
            //      }else if(count == 13) {
            result.render(("card113"), col1.get((col1.size()) - 1));
            result.render(("card213"), col2.get((col2.size()) - 1));
            result.render(("card313"), col3.get((col3.size()) - 1));
            result.render(("card413"), col4.get((col4.size()) - 1));
            //     } */



           // return result;
        }
        //Col 1 Move
        else if(button == 1){

        }
        //Col 1 remove
        else if(button == 2){

        }
        //Col 2 Move
        else if(button == 3){

        }
        //Col 2 remove
        else if(button == 4){

        }
        //Col 3 Move
        else if(button == 5){

        }
        //Col 3 remove
        else if(button == 6){

        }
        //Col 4 Move
        else if(button == 7){

        }
        //Col 4 remove
        else if(button == 8){

        }

        return result;
        //   return Results.html().template("views/testview/testview.ftl.html");
    }





}