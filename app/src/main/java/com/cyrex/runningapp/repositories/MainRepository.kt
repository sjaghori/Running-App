package com.cyrex.runningapp.repositories

import com.cyrex.runningapp.db.Run
import com.cyrex.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDAO: RunDAO
) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedByTimeInMillis(run: Run) = runDAO.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByDistance(run: Run) = runDAO.getAllRunsSortedByDistance()

    fun getAllRunsAvgSpeed(run: Run) = runDAO.getAllRunsAvgSpeed()

    fun getAllRunsCaloriesBurned(run: Run) = runDAO.getAllRunsCaloriesBurned()

    fun getTotalTimeInMillis(run: Run) = runDAO.getTotalTimeInMillis()

    fun getTotalCaloriesBurned(run: Run) = runDAO.getTotalCaloriesBurned()

    fun getTotalDistance(run: Run) = runDAO.getTotalDistance()

    fun getTotalAvgSpeed(run: Run) = runDAO.getTotalAvgSpeed()
}