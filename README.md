So we have created a class named "Participants". In that we have 3 entities, health, strength and attack. 

After creating the class, we are creating 2 objects, firstPlayer and secondPlayer.

In this project, we are using Math.Random() function and we are setting the limit to 6, because we can get a max number 6 in a dice.

In every iteration we are multiplying the random dice number with the attack of a participant to the multiplication of random dice number eith the defence of another participant.

We have also taken Max() function in-order to get who's strength and who's attack is bigger. And simultaneously we are subtracting too.

If any participant's health reaches 0, the other participant wins.



// SAMPLE UNIT TEST FOR REFERENCE


    @Test
    public void testApplication()
    {
        Participant firstPlayer = new Participant(50, 5, 10);
        Participant secondPlayer = new Participant(100, 10, 5);

        Assert.assertEquals(ma.calculate(firstPlayer, secondPlayer), "Player B wins!", "Player B won, but test was done");
    }
